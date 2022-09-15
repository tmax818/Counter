package tylermaxwell.counter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Controller
public class MainController {

    @RequestMapping("")
    public String index(HttpSession session, Model model){
        int currentCount;
        // If the count is not already in session
        if (session.getAttribute("count") == null) {
            // Use setAttribute to initialize the count in session
            session.setAttribute("count", 0);
        }
        else {
            // increment the count by 1 using getAttribute and setAttribute
            currentCount = (int) session.getAttribute("count");
            session.setAttribute("count", currentCount += 1);
        }
        return "index.jsp";
    }

    @RequestMapping("/counter")
    public String counter(HttpSession session, Model model){
        model.addAttribute("countToShow", (int) session.getAttribute("count"));
        return "counter.jsp";
    }

    @RequestMapping("/reset")
    public String reset(HttpSession session){
        session.setAttribute("count", 0);
        return "redirect:/counter";
    }


}

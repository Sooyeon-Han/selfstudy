package board.a01_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("board.do")
public class boardController {
	
	//http://localhost:7080/selfstudy/board.do?method=list
	@RequestMapping(params="method=list")
	public String boardList() {
		return "boardList";
	}
}

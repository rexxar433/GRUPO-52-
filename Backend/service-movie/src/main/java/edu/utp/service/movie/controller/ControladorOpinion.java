package edu.utp.service.movie.controller;

import edu.utp.service.movie.service.OpinionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@CrossOrigin
//@RequestMapping("/api/opiniones")
public class ControladorOpinion {
    @Autowired
    private OpinionService opinionService;
}

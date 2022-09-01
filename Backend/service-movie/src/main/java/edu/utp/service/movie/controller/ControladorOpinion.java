package edu.utp.service.movie.controller;

import edu.utp.service.movie.service.OpinionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ControladorOpinion {
    @Autowired
    private OpinionService opinionService;
}

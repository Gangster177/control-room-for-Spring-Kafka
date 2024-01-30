package com.itprom.jet.office.controllers;

import com.itprom.jet.common.bean.Route;
import com.itprom.jet.office.service.PathService;
import com.itprom.jet.office.service.WaitingRoutesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/routes")
public class RoutRest {
    private final PathService pathService;
    private final WaitingRoutesService waitingRoutesService;

    @PostMapping(path = "route")
    public void addRoute(@RequestBody List<String> routeLocation){
        Route route = pathService.convertLocationToRoute(routeLocation);
        waitingRoutesService.add(route);
    }
}

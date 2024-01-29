package com.itprom.jet.common.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class Route {
    private String boardName;
    private List<RoutePath> path = new ArrayList<>();

    private boolean notAssigned(){
        return boardName == null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class JugsPresentesController {

    @Value("${jugs-presentes}")
    String jugsPresentes;

    @RequestMapping("/jugs-presentes")
    public String showJugsPresentes() {
        return "Los Jugs presentes son: " + jugsPresentes;
    }
}

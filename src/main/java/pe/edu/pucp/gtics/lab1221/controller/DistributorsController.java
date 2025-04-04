package pe.edu.pucp.gtics.lab1221.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value="/home",method=RequestMethod.GET)
public class DistributorsController {
    @PostMapping(value="index.html")
    public String apuestas (@RequestParam("name") Integer apuesta1,
                            @RequestParam("name") Integer apuesta2 )
    {
        return "home/ganador";
    };






    @PostMapping(value="/guardar")
    public String guardarDistribuidora(){
        return "";
    };
    @DeleteMapping(value="/olita")
    public String borrarDistribuidora(){
        return "";
    };

}

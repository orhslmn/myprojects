package com.githubtest.demo.Controller;
import com.githubtest.demo.Modul.Menuler;
import com.githubtest.demo.Modul.Tables;
import com.githubtest.demo.Repository.MenulerRepository;
import com.githubtest.demo.Repository.Repository;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/newuser")
public class Controller {
    @Autowired
    Repository rp;
    MenulerRepository mrp;
    @GetMapping("/save")
    public JSONObject jo(@RequestParam String name,@RequestParam String lastname,@RequestParam String username, @RequestParam String email, @RequestParam String pass)

    {
        JSONObject job=new JSONObject();
        Tables tbl=new Tables();
        tbl.setName(name);
        tbl.setLastname(lastname);
        tbl.setUsername(username);
        tbl.setEmail(email);
        tbl.setPass(pass);
        rp.save(tbl);
        job.put("success",true);

        return job;
    }
    @GetMapping("/usergiris")
    public JSONObject jarray(@RequestParam String username,@RequestParam String pass)
    {
        JSONObject jo = new JSONObject();
        List<Tables> tb = rp.findAll();
        boolean kullaniciadi = false;
        boolean pasword=false;
        for (Tables ta : tb) {
            if ((ta.getUsername().equals(username)) && (ta.getPass().equals(pass))){
                kullaniciadi = true;
                pasword=true;
                break;
            }
        }
        jo.put("success", kullaniciadi);
        jo.put("succes",pasword);
        return jo;
    }
    @GetMapping("/Menuler")
    public JSONArray jmenuarray(){
        JSONArray Jmarray=new JSONArray();
        List<Menuler> mlist=mrp.findAll();
        for (Menuler ml:mlist){
        JSONObject jmob=new JSONObject();
        jmob.put("menuadi",ml.getMenu());
        jmob.put("menuurl",ml.getUrl());
        Jmarray.add(jmob);
        }
        return  Jmarray;
    }

}


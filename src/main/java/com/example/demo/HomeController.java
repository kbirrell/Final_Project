package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @Autowired
    ListRepository ListItemRepository

    @RequestMapping("/")
    public String listListItem(Model model){
        model.addAttribute("listitem", new ListItem());
        return "listitem";

    @GetMapping("add")
    public String listItemForm(Model model){
        model.addAttribute("listitem", new ListItem());
        return "listitemform";

    @PostMapping("/process")
    public String processForm(@Valid ListItem listitem)
        BindingResult result{
            if (result.hasErrors()){
                return "listitemform";
            }
            listItemRepository.save(listitem);
            return "redirect:/";
            }

    @RequestMapping("/detail/{id}")
    public String showListItem(@PathVariable("id") long id, Model model)
    {
        model.addAttribute("listitem", listRepository.findById(id).get());
        return "show";
    }

    @RequestMapping("/update/{id}")
    public String updateListItem(@PathVariable("id") long id,
            Model model) {
        model.addAttribute("listitem", listItemRepository.findById(id).get());
        return "listItemform";
            }

    @RequestMapping("/delete/{id}")
    public String deleteListItem(@PathVariable("id") long id,
        listItemRepository.deleteById(id);
        return "redirect:/";

            }

    }

}

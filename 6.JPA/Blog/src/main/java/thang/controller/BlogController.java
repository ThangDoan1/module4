package thang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import thang.model.Blogged;
import thang.service.BloggedService;

import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {

    @Autowired
    private BloggedService bloggedService;

    @GetMapping("/create-blog")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("blog", new Blogged());
        return modelAndView;
    }

    @PostMapping("/blog-create")
    public String saveBlog(
            @ModelAttribute("blog") Blogged blogged,
            RedirectAttributes redirectAttributes
    ) {
        bloggedService.save(blogged);
        redirectAttributes.addFlashAttribute("message", "New create blog successfully");
        return "redirect:/blog";
    }

    @GetMapping("/blog")
    public ModelAndView listBlog() {
        ModelAndView modelAndView = new ModelAndView("/list");
        List<Blogged> blogList = bloggedService.findAll();
        modelAndView.addObject("blog", blogList);
        return modelAndView;
    }


    @GetMapping("/blog/{id}/edit")
    public ModelAndView showEditBlog(
            @PathVariable("id") Integer id
    ) {
        Blogged blog = bloggedService.findById(id);
        if (blog != null) {
            ModelAndView modelAndView = new ModelAndView("/edit");
            modelAndView.addObject("blog", blog);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error");
            return modelAndView;
        }
    }

    @PostMapping("/blog-save")
    public String updateBlog(
            @ModelAttribute("blog") Blogged blogged,
            RedirectAttributes redirectAttributes
    ) {
        bloggedService.save(blogged);
//        ModelAndView modelAndView = new ModelAndView();
        redirectAttributes.addFlashAttribute("message", "Blog updated successfully");
        return "redirect:/blog";
    }

    @GetMapping("/blog/{id}/delete")
    public ModelAndView deleteBlog(
            @PathVariable("id") Integer id
    ) {
        Blogged blogged = bloggedService.findById(id);
        if (blogged != null) {
            ModelAndView modelAndView = new ModelAndView("/delete");
            modelAndView.addObject("blog", blogged);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error");
            return modelAndView;
        }
    }

    @PostMapping("/blog-remove")
    public String removeBlog(
            @ModelAttribute("blog") Blogged blogged,
            RedirectAttributes redirectAttributes
    ) {
        bloggedService.deleteById(blogged.getId());
        redirectAttributes.addFlashAttribute("message", "Blog remove successfully");
        return "redirect:/blog";
    }

    @GetMapping("/blog/{id}/view")
    public ModelAndView viewBlog(
            @PathVariable("id") Integer id
    ) {
        Blogged blogged = bloggedService.findById(id);
        if (blogged != null) {
            ModelAndView modelAndView = new ModelAndView("/view");
            modelAndView.addObject("blog", blogged);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error");
            return modelAndView;
        }

    }
}

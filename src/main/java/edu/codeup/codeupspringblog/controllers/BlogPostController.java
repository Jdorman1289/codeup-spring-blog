package edu.codeup.codeupspringblog.controllers;

import edu.codeup.codeupspringblog.models.BlogPost;
import edu.codeup.codeupspringblog.repositories.BlogPostRepository;
import edu.codeup.codeupspringblog.repositories.UserRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/posts")
public class BlogPostController {

   private  BlogPostRepository blogPostsDAO;
   private UserRepo usersDAO;

    public BlogPostController(BlogPostRepository blogPostsDAO, UserRepo usersDAO) {
        this.blogPostsDAO = blogPostsDAO;
        this.usersDAO = usersDAO;
    }

    @GetMapping
    public String indexPage(Model vModel) {
        vModel.addAttribute("blogposts", blogPostsDAO.findAll());
        return "blogposts/index";
    }

    @GetMapping("/{id}")
    public String viewIndividualPost(@PathVariable long id, Model vModel) {

        return "blogposts/show";
    }

    @GetMapping("/create")
    public String showCreatePostView() {
        return "blogposts/create";
    }

    @PostMapping("/create")
    public String doPost(@RequestParam String title, @RequestParam String body) {
        BlogPost newPost = new BlogPost(title, body);

        blogPostsDAO.save(newPost);

        return "redirect:/posts";
    }

}
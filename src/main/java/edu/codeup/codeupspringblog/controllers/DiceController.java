//package edu.codeup.codeupspringblog.controllers;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.Random;
//
//@Controller
//public class DiceController {
//
//    @GetMapping("/roll-dice")
//    @ResponseBody
//    public String rollDice() {
//        return "roll-dice";
//    }
//
//    @GetMapping("/roll-dice/{guess}")
//    public String rollDice(@PathVariable int guess, Model model) {
//        Random random = new Random();
//        int diceRoll = random.nextInt(6) + 1;
//        model.addAttribute("guess", guess);
//        model.addAttribute("diceRoll", diceRoll);
//        model.addAttribute("isCorrect", guess == diceRoll);
//        return "roll_dice";
//    }
//}

package codegym.controller;

import codegym.model.Product;
import codegym.service.IProductSer;
import codegym.service.ProductSer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller
public class ProductController {
    private final IProductSer productSer = new ProductSer();


    @GetMapping("/product")
    public String list(Model model) {
        List<Product> productList = productSer.findAll();
        model.addAttribute("product", productList);
        return ("index");
    }

    @GetMapping("create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("save")
    public String save(Product product, Model model) {
        product.setId((int) (Math.random() * 100));
        productSer.save(product);
        model.addAttribute("msg", "Created");
        return "create";
    }

    @GetMapping("{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", productSer.findById(id));
        return "edit";
    }

    @PostMapping("{id}/update")
    public String update(Product product) {
        productSer.update(product.getId(), product);
        return "redirect:/product";
    }
//<td><a th:href="@{/{id}/delete(id=${row.getId()})}">delete</a></td>
    @GetMapping("{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("product", productSer.findById(id));
        return "/delete";
    }

    @PostMapping("delete")
    public String delete(Product product, RedirectAttributes redirect) {
        productSer.remove(product.getId());
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/product";
    }


    @PostMapping("search")
    public String findByName(@RequestParam("name") String name, Model model) {
        model.addAttribute("product", productSer.findByName(name));
        return "index";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", productSer.findById(id));
        return "/view";
    }
}


package org.grunskii.rendering;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rendering")
public class RenderController {

    @GetMapping("/render")
    public ResponseEntity<String> addNewOrder() {
        return ResponseEntity.ok("The order has been placed!");
    }
}

package com.example.demo;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping(value = "/", produces = "text/html")
    public String dashboard() {
        return """
        <!DOCTYPE html>
        <html>
        <head>
            <title>Java App - Muhammad Afnan Khan</title>
            <style>
                body {
                    font-family: sans-serif;
                    background: #0f1117;
                    color: #e2e8f0;
                    display: flex;
                    align-items: center;
                    justify-content: center;
                    height: 100vh;
                    margin: 0;
                }

                .box {
                    background: #1e2330;
                    border: 1px solid #2a3044;
                    border-radius: 16px;
                    padding: 40px 50px;
                    text-align: center;
                }

                h1 {
                    color: #4ade80;
                    margin-bottom: 8px;
                }

                p {
                    color: #94a3b8;
                }

                .badge {
                    display: inline-block;
                    background: #166534;
                    color: #4ade80;
                    border-radius: 20px;
                    padding: 4px 14px;
                    font-size: 13px;
                    margin-top: 16px;
                }
            </style>
        </head>
        <body>
            <div class="box">
                <h1>Java Dashboard</h1>
                <p>Framework: Spring Boot </p>
                <p> Deployed by Muhammad Afnan Khan</p>
                <div class="badge">Running</div>
            </div>
        </body>
        </html>
        """;
    }

    @GetMapping("/api/info")
    public Map<String, String> info() {
        return Map.of(
            "framework", "Spring Boot",
            "deployed_by", "Muhammad Afnan Khan",
            "status", "running"
        );
    }
}
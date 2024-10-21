package com.eksdemo;

import java.util.logging.Logger;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/eks")
public class EksController {

    private static final Logger logger = Logger.getLogger(EksController.class.getName());

    @PostMapping("/create")
    public String createCluster(@RequestParam String clusterName, @RequestParam String roleArn,
                                @RequestParam String subnetIds, @RequestParam String securityGroupIds) {
        logger.info("Received request to create EKS cluster");
        return "Success";
    }
}

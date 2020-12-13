package com.bars.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.bars.entity.Billing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BarsController extends FileProcessor {

        private static final Logger log = LoggerFactory.getLogger(BarsController.class);

        private FileProcessor fileProcessor;

        @Autowired
        public BarsController(FileProcessor theFileProcessor) {
        fileProcessor = theFileProcessor;
        }

    @GetMapping("bars")
        public List<Billing> requestBilling(@RequestParam String filePath) throws NumberFormatException, IOException{

        File fileDir=new File("C:\\BARS_TEST\\"+filePath);

        if(fileDir.exists()){
        fileProcessor.execute(fileDir);
        }else{
        throw new RuntimeException("No supported request file found in the path"+filePath);
        }
        return null;
        }

        //add comment for pr
}

package com.vbs.vbs.services;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileService {
    String uploadImage( String email , MultipartFile file) throws IOException;
}
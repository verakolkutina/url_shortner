package com.example.url.model;

import lombok.Getter;

@Getter
public class UrlErrorResponseDto {
    private String status;
    private String error;

    public UrlErrorResponseDto() {
        this.status = status;
        this.error = error;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "UrlErrorResponseDto{" +
                "status='" + status + '\'' +
                ", error='" + error + '\'' +
                '}';
    }
}

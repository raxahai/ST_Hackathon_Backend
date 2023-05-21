package com.sastaticket.hackathon.dto.reponse;

import com.sastaticket.hackathon.entity.Document;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DocumentDto {
    private List<Document> documents;
}

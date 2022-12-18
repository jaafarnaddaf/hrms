package com.livelightlabs.hrms.document.geography;

import com.livelightlabs.hrms.bean.Localization;
import com.livelightlabs.hrms.document.BaseDocument;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class City extends BaseDocument {
    @DBRef private Country country;
    private Localization name;
}

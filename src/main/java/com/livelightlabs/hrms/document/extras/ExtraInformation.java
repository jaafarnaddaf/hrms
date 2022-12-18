package com.livelightlabs.hrms.document.extras;

import lombok.Data;

import java.util.List;

@Data
public class ExtraInformation {
    private ApparelSize apparelSize;
    private List<Allergy> allergies;
    private List<DietaryRestriction> dietaryRestrictions;
}

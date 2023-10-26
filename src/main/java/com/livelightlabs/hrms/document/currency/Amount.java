package com.livelightlabs.hrms.document.currency;

import lombok.Data;

@Data
public class Amount {
    private double value;
    private Currency currency;
}

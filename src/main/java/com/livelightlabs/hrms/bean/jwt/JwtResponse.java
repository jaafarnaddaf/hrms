package com.livelightlabs.hrms.bean.jwt;

import java.io.Serial;
import java.io.Serializable;

public record JwtResponse(String jwtToken) implements Serializable {
  @Serial
  private static final long serialVersionUID = -8091879091924046844L;
}

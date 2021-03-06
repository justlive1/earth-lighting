package justlive.earth.breeze.lighting.chained.model.webhook;

import lombok.Data;

/**
 * webhook返回
 * 
 * @author wubo
 *
 */
@Data
public class Payload {

  private String ref;

  private String before;

  private String after;

  private String compare;

  private Repository repository;

}

package me.kopz.webclient.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@ConfigurationProperties(value = "spring.backend")
public class RestProperties {

  private String host;

  public RestProperties() {
  }

  public RestProperties(String host) {
    this.host = host;
  }

  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  @Override
  public String toString() {
    return "RestProperties{" +
        "host='" + host + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RestProperties that = (RestProperties) o;
    return Objects.equals(host, that.host);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(host);
  }
}
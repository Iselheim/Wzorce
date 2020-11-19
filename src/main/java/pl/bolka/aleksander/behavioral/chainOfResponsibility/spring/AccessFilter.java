package pl.bolka.aleksander.behavioral.chainOfResponsibility.spring;

import java.io.IOException;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;

@Component
@Order(1)
public class AccessFilter implements Filter {

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
    HttpServletRequest req = (HttpServletRequest) servletRequest;

    // odbicie nieautoryzaownych requestów

    filterChain.doFilter(servletRequest, servletResponse);

  }
}

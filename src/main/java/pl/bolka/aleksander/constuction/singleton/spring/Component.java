package pl.bolka.aleksander.constuction.singleton.spring;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

@org.springframework.stereotype.Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Component {
}

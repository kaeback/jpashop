package jpabook.jpashop.domain.item;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue(value = "A")
@Getter @Setter
public class Aabum extends Item {
    
    private String artist;
    private String etc;
}

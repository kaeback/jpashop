package jpabook.jpashop.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import jpabook.jpashop.domain.Member;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MemberRepository {
    
    private final EntityManager entityManager;

    public void save(Member member) {
        entityManager.persist(member);
    }

    public Member findOne(Long id) {
        Member member = entityManager.find(Member.class, id);
        return member;
    }

    public List<Member> findAll() {
        return entityManager.createQuery("select m from Member m", Member.class)
            .getResultList();
    }

    public List<Member> findByName(String name) {
        return entityManager.createQuery("select m from Member m where m.name = :name", Member.class)
            .setParameter("name", name)
            .getResultList();
    }
}

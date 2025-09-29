package dasturlash.uz.notification.repository;

import dasturlash.uz.notification.entity.NotificationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface NotificationRepository extends JpaRepository<NotificationEntity, String> {

    List<NotificationEntity> findByPhoneNumberOrderByCreatedDateDesc(String toAccount);
}


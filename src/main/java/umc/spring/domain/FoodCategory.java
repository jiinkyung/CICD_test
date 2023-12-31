package umc.spring.domain;

import lombok.*;
import umc.spring.domain.base.BaseEntity;
import umc.spring.domain.mapping.MemberPrefer;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class FoodCategory extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 10)
    private String name;

    @OneToMany(mappedBy = "foodCategory", cascade = CascadeType.ALL)
    @Builder.Default
    private List<Store> storeList = new ArrayList<>();

    @OneToMany(mappedBy = "foodCategory", cascade = CascadeType.ALL)
    @Builder.Default
    private List<MemberPrefer> memberPreferList = new ArrayList<>();
}

package run.halo.app.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.lang.NonNull;
import run.halo.app.model.dto.GalleryDTO;
import run.halo.app.model.entity.Gallery;
import run.halo.app.model.params.GalleryParam;
import run.halo.app.model.params.GalleryQuery;
import run.halo.app.model.vo.GalleryTeamVO;
import run.halo.app.service.base.CrudService;

import java.util.List;

/**
 * Gallery service.
 *
 * @author johnniang
 */
public interface GalleryService extends CrudService<Gallery, Integer> {

    /**
     * List gallery dtos.
     *
     * @param sort sort
     * @return all galleries
     */
    List<GalleryDTO> listDtos(@NonNull Sort sort);

    /**
     * Lists gallery team vos.
     *
     * @param sort must not be null
     * @return a list of gallery team vo
     */
    List<GalleryTeamVO> listTeamVos(@NonNull Sort sort);

    /**
     * List galleries by team.
     *
     * @param team team
     * @param sort sort
     * @return list of galleries
     */
    List<GalleryDTO> listByTeam(@NonNull String team, Sort sort);

    /**
     * Pages gallery output dtos.
     *
     * @param pageable     page info must not be null
     * @param galleryQuery galleryQuery
     * @return a page of gallery output dto
     */
    @NonNull
    Page<GalleryDTO> pageDtosBy(@NonNull Pageable pageable, GalleryQuery galleryQuery);

    /**
     * Creates gallery by gallery param.
     *
     * @param galleryParam must not be null
     * @return create gallery
     */
    @NonNull
    Gallery createBy(@NonNull GalleryParam galleryParam);
}

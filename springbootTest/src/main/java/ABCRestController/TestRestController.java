package ABCRestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;

@Api(tags = {"1. Point"}) // 이 부분이 swagger-ui.html 에 나오는 제목겸 순서입니다.
@RestController
@RequestMapping(value = "/v1/web/point")
@Slf4j
public class TestRestController {

//	@Autowired
//    private ResponseTemplate responseTemplate;
//    @Autowired
//    private PointApiService pointApiService;
//
//    @ApiOperation(value = "포인트 사용내역 조회", notes = "회원의 포인트 사용내역을 조회한다.") // 해당 api에 대한 설명입니다.
//    @GetMapping(value = "/history")
//    public SingleResult<PointHistoryList> pointHistory( 
//            @ApiParam(value = "pageNumber", required = false) @RequestParam(required = false, defaultValue = "1") int pageNumber, // param 에 대한 설명입니다.
//            @ApiParam(value = "pageSize", required = false) @RequestParam(required = false, defaultValue = "10") int pageSize // param 에 대한 설명입니다.
//    ) {
//        User loginUser = getLoginUserByToken();
//        PageInfo pageInfo = new PageInfo();
//        pageInfo.setPageNumber(pageNumber);
//        pageInfo.setPageSize(pageSize);
//        return responseTemplate.getResult(pointApiService.getPointHistoryList(loginUser, pageInfo));
//    }

}

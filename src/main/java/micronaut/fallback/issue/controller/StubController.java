package micronaut.fallback.issue.controller;

import io.micronaut.context.annotation.Parameter;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.HashMap;
import java.util.Map;

@Controller
public class StubController {

    @Get("/members/{memberID}")
    public HttpResponse<Map<String, String>> getMemberFlattened(@Parameter long memberID) {
        Map<String, String> map = new HashMap<>();
        map.put("hello", "world " + memberID);
        return HttpResponse.ok(map);
    }

    @Get("/memgroups/{memGroupID}")
    public HttpResponse<Map<String, String>> getMemGroupFlattened(@Parameter long memGroupID) {
        Map<String, String> map = new HashMap<>();
        map.put("hello", "world " + memGroupID);
        return HttpResponse.ok(map);
    }
}

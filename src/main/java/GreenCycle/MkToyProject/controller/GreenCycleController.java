package GreenCycle.MkToyProject.controller;

import GreenCycle.MkToyProject.domain.entity.CenterLocationInfo;
import GreenCycle.MkToyProject.service.CenterLocationInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GreenCycleController {

    private final CenterLocationInfoService centerLocationInfoService;

    @GetMapping("/api/map")
    public List<CenterLocationInfo> searchAllMap() {
        return centerLocationInfoService.searchAll();
    }

}

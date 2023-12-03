package GreenCycle.MkToyProject.controller;

import GreenCycle.MkToyProject.domain.entity.CenterInfo;
import GreenCycle.MkToyProject.domain.entity.CenterLocationInfo;
import GreenCycle.MkToyProject.service.CenterInfoService;
import GreenCycle.MkToyProject.service.CenterLocationInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class GreenCycleController {

    private final CenterLocationInfoService centerLocationInfoService;
    private final CenterInfoService centerInfoService;

    @GetMapping("/api/map")
    public List<CenterLocationInfo> searchAllMap() {
        return centerLocationInfoService.searchAll();
    }

    @GetMapping("/api/mapDetail/{id}")
    public List<CenterInfo> searchAllDetail(@PathVariable("id") Long id) {
        return centerInfoService.findDetail(id);
    }


}

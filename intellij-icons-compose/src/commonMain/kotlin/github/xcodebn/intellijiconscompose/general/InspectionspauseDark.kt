package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val InspectionspauseDark: ImageVector
    get() {
        if (_InspectionspauseDark != null) return _InspectionspauseDark!!

        _InspectionspauseDark = ImageVector.Builder(
            name = "InspectionspauseDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {

        }.build()

        return _InspectionspauseDark!!
    }

private var _InspectionspauseDark: ImageVector? = null


package github.xcodebn.intellijiconscompose.windows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MinimizesmallDark: ImageVector
    get() {
        if (_MinimizesmallDark != null) return _MinimizesmallDark!!

        _MinimizesmallDark = ImageVector.Builder(
            name = "MinimizesmallDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {

        }.build()

        return _MinimizesmallDark!!
    }

private var _MinimizesmallDark: ImageVector? = null


package github.xcodebn.intellijiconscompose.gutter

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UniqueDark: ImageVector
    get() {
        if (_UniqueDark != null) return _UniqueDark!!

        _UniqueDark = ImageVector.Builder(
            name = "UniqueDark",
            defaultWidth = 8.0.dp,
            defaultHeight = 8.0.dp,
            viewportWidth = 8.0f,
            viewportHeight = 8.0f
        ).apply {

        }.build()

        return _UniqueDark!!
    }

private var _UniqueDark: ImageVector? = null


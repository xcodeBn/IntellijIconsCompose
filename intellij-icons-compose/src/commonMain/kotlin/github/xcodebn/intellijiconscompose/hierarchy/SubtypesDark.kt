package github.xcodebn.intellijiconscompose.hierarchy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SubtypesDark: ImageVector
    get() {
        if (_SubtypesDark != null) return _SubtypesDark!!

        _SubtypesDark = ImageVector.Builder(
            name = "SubtypesDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {

        }.build()

        return _SubtypesDark!!
    }

private var _SubtypesDark: ImageVector? = null


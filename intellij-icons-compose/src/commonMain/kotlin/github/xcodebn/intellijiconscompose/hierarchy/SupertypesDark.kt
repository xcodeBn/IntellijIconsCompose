package github.xcodebn.intellijiconscompose.hierarchy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SupertypesDark: ImageVector
    get() {
        if (_SupertypesDark != null) return _SupertypesDark!!

        _SupertypesDark = ImageVector.Builder(
            name = "SupertypesDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {

        }.build()

        return _SupertypesDark!!
    }

private var _SupertypesDark: ImageVector? = null


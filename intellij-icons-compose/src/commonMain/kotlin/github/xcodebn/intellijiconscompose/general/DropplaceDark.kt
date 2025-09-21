package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DropplaceDark: ImageVector
    get() {
        if (_DropplaceDark != null) return _DropplaceDark!!

        _DropplaceDark = ImageVector.Builder(
            name = "DropplaceDark",
            defaultWidth = 2.0.dp,
            defaultHeight = 20.0.dp,
            viewportWidth = 2.0f,
            viewportHeight = 20.0f
        ).apply {

        }.build()

        return _DropplaceDark!!
    }

private var _DropplaceDark: ImageVector? = null


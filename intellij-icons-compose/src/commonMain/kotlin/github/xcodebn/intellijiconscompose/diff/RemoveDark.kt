package github.xcodebn.intellijiconscompose.diff

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RemoveDark: ImageVector
    get() {
        if (_RemoveDark != null) return _RemoveDark!!

        _RemoveDark = ImageVector.Builder(
            name = "RemoveDark",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {

        }.build()

        return _RemoveDark!!
    }

private var _RemoveDark: ImageVector? = null


package github.xcodebn.intellijiconscompose.vcs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowLeftDark: ImageVector
    get() {
        if (_ArrowLeftDark != null) return _ArrowLeftDark!!

        _ArrowLeftDark = ImageVector.Builder(
            name = "ArrowLeftDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 2f)
                lineTo(8f, 8f)
                lineTo(-2f, 8f)
                close()
            }
        }.build()

        return _ArrowLeftDark!!
    }

private var _ArrowLeftDark: ImageVector? = null


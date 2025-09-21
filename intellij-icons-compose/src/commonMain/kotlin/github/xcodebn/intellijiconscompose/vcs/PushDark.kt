package github.xcodebn.intellijiconscompose.vcs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PushDark: ImageVector
    get() {
        if (_PushDark != null) return _PushDark!!

        _PushDark = ImageVector.Builder(
            name = "PushDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF499C54))
            ) {
                moveTo(6f, 3f)
                lineTo(13f, 10f)
                lineTo(6f, 10f)
                close()
            }
        }.build()

        return _PushDark!!
    }

private var _PushDark: ImageVector? = null


package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SetdefaultDark: ImageVector
    get() {
        if (_SetdefaultDark != null) return _SetdefaultDark!!

        _SetdefaultDark = ImageVector.Builder(
            name = "SetdefaultDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(14f, 2f)
                lineTo(16f, 4f)
                lineTo(6f, 13f)
                lineTo(2f, 9f)
                lineTo(4f, 7f)
                lineTo(6f, 10f)
                close()
            }
        }.build()

        return _SetdefaultDark!!
    }

private var _SetdefaultDark: ImageVector? = null


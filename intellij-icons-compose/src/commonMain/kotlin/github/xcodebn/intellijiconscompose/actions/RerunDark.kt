package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RerunDark: ImageVector
    get() {
        if (_RerunDark != null) return _RerunDark!!

        _RerunDark = ImageVector.Builder(
            name = "RerunDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF499C54))
            ) {
                moveTo(2f, 3f)
                lineTo(8f, 8f)
                lineTo(2f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF499C54))
            ) {
                moveTo(9f, 3f)
                lineTo(15f, 8f)
                lineTo(9f, 13f)
                close()
            }
        }.build()

        return _RerunDark!!
    }

private var _RerunDark: ImageVector? = null


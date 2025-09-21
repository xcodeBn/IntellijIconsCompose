package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ResumeDark: ImageVector
    get() {
        if (_ResumeDark != null) return _ResumeDark!!

        _ResumeDark = ImageVector.Builder(
            name = "ResumeDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF499C54))
            ) {
                moveTo(8f, 2f)
                lineTo(9f, 2f)
                lineTo(15f, 8f)
                lineTo(9f, 13f)
                lineTo(8f, 13f)
                close()
            }
        }.build()

        return _ResumeDark!!
    }

private var _ResumeDark: ImageVector? = null


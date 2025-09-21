package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DeletetagDark: ImageVector
    get() {
        if (_DeletetagDark != null) return _DeletetagDark!!

        _DeletetagDark = ImageVector.Builder(
            name = "DeletetagDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 12f)
                lineTo(4f, 11f)
                lineTo(11f, 4f)
                lineTo(12f, 5f)
                lineTo(5f, 12f)
                close()
            }
        }.build()

        return _DeletetagDark!!
    }

private var _DeletetagDark: ImageVector? = null


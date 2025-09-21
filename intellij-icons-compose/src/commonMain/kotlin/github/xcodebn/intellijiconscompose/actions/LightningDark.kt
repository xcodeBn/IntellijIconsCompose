package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LightningDark: ImageVector
    get() {
        if (_LightningDark != null) return _LightningDark!!

        _LightningDark = ImageVector.Builder(
            name = "LightningDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF0A732))
            ) {
                moveTo(9f, 10f)
                lineTo(3f, 13f)
                lineTo(3f, 3f)
                lineTo(8f, 0f)
                lineTo(7f, 6f)
                lineTo(13f, 3f)
                lineTo(10f, 16f)
                close()
            }
        }.build()

        return _LightningDark!!
    }

private var _LightningDark: ImageVector? = null


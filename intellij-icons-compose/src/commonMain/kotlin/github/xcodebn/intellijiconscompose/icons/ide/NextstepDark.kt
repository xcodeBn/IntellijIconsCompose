package github.xcodebn.intellijiconscompose.icons.ide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NextstepDark: ImageVector
    get() {
        if (_NextstepDark != null) return _NextstepDark!!

        _NextstepDark = ImageVector.Builder(
            name = "NextstepDark",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(9f, 6f)
                lineTo(3f, 10f)
                lineTo(3f, 2f)
                lineTo(9f, 6f)
                close()
            }
        }.build()

        return _NextstepDark!!
    }

private var _NextstepDark: ImageVector? = null


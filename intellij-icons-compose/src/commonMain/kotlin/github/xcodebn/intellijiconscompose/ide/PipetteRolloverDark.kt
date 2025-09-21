package github.xcodebn.intellijiconscompose.ide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PipetteRolloverDark: ImageVector
    get() {
        if (_PipetteRolloverDark != null) return _PipetteRolloverDark!!

        _PipetteRolloverDark = ImageVector.Builder(
            name = "PipetteRolloverDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFC75450))
            ) {
                moveTo(15f, 3f)
                lineTo(13f, 1f)
                curveTo(13.04f, 0.66f, 12.57f, 0.66f, 12.29f, 0.95f)
                lineTo(10f, 3f)
                lineTo(9f, 2f)
                lineTo(8f, 3f)
                lineTo(9f, 4f)
                lineTo(2f, 10f)
                lineTo(2f, 14f)
                lineTo(6f, 14f)
                lineTo(12f, 7f)
                lineTo(13f, 8f)
                lineTo(14f, 7f)
                lineTo(13f, 6f)
                lineTo(15f, 4f)
                curveTo(15.34f, 3.43f, 15.34f, 2.96f, 15.05f, 2.67f)
                close()
                moveTo(5f, 13f)
                lineTo(3f, 11f)
                lineTo(9f, 5f)
                lineTo(11f, 7f)
                lineTo(5f, 13f)
                close()
            }
        }.build()

        return _PipetteRolloverDark!!
    }

private var _PipetteRolloverDark: ImageVector? = null

